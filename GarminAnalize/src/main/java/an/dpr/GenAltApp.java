package an.dpr;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import an.dpr.cycling.altimetria.AltimetriaImagen;
import an.dpr.cycling.altimetria.AltimetryBL;
import an.dpr.cycling.altimetria.AltimetryBLImpl;
import an.dpr.cycling.altimetria.AltimetryContratcs.TipoDatos;
import an.dpr.cycling.altimetria.AltimetryGenerator;
import an.dpr.cycling.altimetria.AltimetryGeneratorFactory;
import an.dpr.cycling.altimetria.ConfiguracionAltimetria;
import an.dpr.cycling.beans.AltimetryPoint;
import an.dpr.cycling.beans.Climb;
import an.dpr.cycling.beans.GPXAltimetriaPoint;
import an.dpr.cycling.reader.ITrackInfo;
import an.dpr.cycling.util.UtilSwing;
import an.dpr.garmin.analize.AltitudBean;

public class GenAltApp {
    
    private static final Logger log = Logger.getLogger(GenAltApp.class);

    public static void main(String[] args){
	try {
	    generarAltimetria();
	} catch (Exception e) {
	    log.error(" ", e);
	}
    }
    
    private static void generarAltimetria() throws Exception {
	File file = getFile();
	if (file != null){
	    ITrackInfo tinfo =  getTrackInfoBean(file);
	    Set<AltimetryPoint> data = tinfo.getAltimetrySet(file);
	    
	    
	    getPuertos(data);
//	rutaPorKm(data, 25000.0,30000.0, false);
	    rutaEntera(data);
	}
    }
    
    private static ITrackInfo getTrackInfoBean(File file) {
	ITrackInfo ret;
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	String fileName = file.getName();
	String trackInfoBean = null;
	if (fileName != null){
	    if (fileName.contains(".gpx")){
		trackInfoBean = "gpxTrackInfo";
	    } else if (fileName.contains(".txt")){
		trackInfoBean = "polarTrackInfo";
	    }
	} 
	 ret = (ITrackInfo) ctx.getBean(trackInfoBean);
	return ret;
    }

    private static File getFile(){
	return UtilSwing.getFile("txt","gpx");
    }
    
    private static void getPuertos(Set<AltimetryPoint> data){
	int index = 1;
	AltimetryBL altBL = new AltimetryBLImpl();// TODO spring!!
	((AltimetryBLImpl) altBL).init();// TODO spring!!
	Collection<AltimetryPoint> climbData;

	 List<Climb> climbs = altBL.getClimbs(data);
	 for (Climb climb : climbs) {
	 climbData = altBL.getClimbData(climb, data);
	 String rutaFile = "/home/rsaez/Documents/ganalize/altimetria" + index
	 + ".png";
	 // String rutaFile = "/var/ganalize/altimetria" + index + ".png";
	 new AltimetriaImagen(climb.getKmIni(), climbData,
	 ConfiguracionAltimetria.getConfiguracion(), rutaFile);
	 index++;
	
	 }
    }

    private static void rutaPorKm(Set<AltimetryPoint> data, Double kmIni,
	    Double kmFin, boolean finalAlto) {
	// climbs
	AltimetryBL altBL = new AltimetryBLImpl();// TODO spring!!
	((AltimetryBLImpl) altBL).init();// TODO spring!!
	Collection<AltimetryPoint> climbData;

	Climb climb = ((AltimetryBLImpl) altBL).getClimbByKm(data, kmIni,
		kmFin, finalAlto);
	climbData = altBL.getClimbData(climb, data);
	String rutaFile = "/home/rsaez/Documents/ganalize/altimetria_km.png";
	new AltimetriaImagen(climbData,
		ConfiguracionAltimetria.getConfiguracion(), rutaFile);
    }

    private static void rutaEntera(Collection<AltimetryPoint> data) {
	// unica ruta
	String rutaFile = "/home/rsaez/Documents/ganalize/altimetria.png";
	// String rutaFile = "/var/ganalize/altimetria.png";
	new AltimetriaImagen(data, ConfiguracionAltimetria.getConfiguracion(),
		rutaFile);

    }

    private static Set<AltimetryPoint> getSetAltimetria(List<AltitudBean> list) {
	TreeSet<AltimetryPoint> set = new TreeSet<AltimetryPoint>();
	GPXAltimetriaPoint ap = null;
	for (AltitudBean ab : list) {
	    ap = new GPXAltimetriaPoint();
	    ap.setTime(ab.getTime());
	    ap.setAltitud(ab.getAltitud());
	    ap.setMetros(ab.getMetrosAvanzados());
	    set.add(ap);
	}
	return set;
    }    
}
