package an.dpr.routeanalyzer.bean;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.ImageIcon;
import static an.dpr.routeanalyzer.ConfiguracionContracts.*;

/**
 * ConfiguracionAltimetriaBean
 * 
 * @author rsaez
 * @version 
 */
public class ConfiguracionBean implements Serializable {

    private String nombre;
    private Integer reductorX;
    private Integer reductorY;
    private Integer porcentajeCadaMetros;
    private Boolean voltearAuto;
    private String idioma;
    private Integer segundosIntervalo;
    private Integer factorCorreccionAltura;
    private Double corteNegativoPuertos;
    private Double minMetrosPuertos;
    private Double minDesnivelPuertos;
    private Double kmInicialesPuertos;
    private Double minDesnivelInicialPuertos;
    // colores
    private String colorKm;
    private Color colorLineas;
    private Color colorLineasSuaves;
    private Color colorTexto;
    private Color colorKmImpar;
    private Color colorKmPar;
    private Color colorHorizonte;
    private Color colorUno;
    private Color colorDos;
    private Color colorTres;
    private Color colorCuatro;
    private Color colorCinco;
    private Color colorRampa;
    // rampas
    private Double mostrarRampasMayores;
    private Double kmUno;
    private Double kmDos;
    private Double kmTres;
    private Double kmCuatro;
    private Double KmCinco;
    /** Icono que el usuario configura para mostrar en sus altimetrias */
    private ImageIcon iconoMarca;
    private Integer offsetX;
    private Integer offsetY;
    private Integer multiplicador;
    private String rutaImg;
    //hr
    private Integer hrZona0;
    private Integer hrZona1;
    private Integer hrZona2;
    private Integer hrZona3;
    private Integer hrZona4;
    private Integer hrZona5;

    /**
     * @return the nombre
     */
    public String getNombre() {
	return nombre;
    }

    /**
     * @param nombre
     *            the nombre to set
     */
    public void setNombre(String nombre) {
	if (nombre == null)
	    this.nombre = V_NOMBRE;
	else
	    this.nombre = nombre;
    }

    /**
     * @return the porcentajeCadaMetros
     */
    public Integer getPorcentajeCadaMetros() {
	return porcentajeCadaMetros;
    }

    /**
     * @param porcentajeCadaMetros
     *            the porcentajeCadaMetros to set
     */
    public void setPorcentajeCadaMetros(Integer porcentajeCadaMetros) {
	if (porcentajeCadaMetros == null)
	    this.porcentajeCadaMetros = V_PORCENTAJE_CADA_METROS;
	else
	    this.porcentajeCadaMetros = porcentajeCadaMetros;
    }

    /**
     * @return the mostrarRampasMayores
     */
    public Double getMostrarRampasMayores() {
	return mostrarRampasMayores;
    }

    /**
     * @param mostrarRampasMayores
     *            the mostrarRampasMayores to set
     */
    public void setMostrarRampasMayores(Double mostrarRampasMayores) {
	if (mostrarRampasMayores == null)
	    this.mostrarRampasMayores = V_MOSTRAR_RAMPAS_MAYORES;
	else
	    this.mostrarRampasMayores = mostrarRampasMayores;
    }

    /**
     * @return the voltearAuto
     */
    public Boolean getVoltearAuto() {
	return voltearAuto;
    }

    /**
     * @param voltearAuto
     *            the voltearAuto to set
     */
    public void setVoltearAuto(Boolean voltearAuto) {
	if (voltearAuto == null)
	    this.voltearAuto = V_VOLTEAR_AUTO;
	else
	    this.voltearAuto = voltearAuto;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
	return idioma;
    }

    /**
     * @param idioma
     *            the idioma to set
     */
    public void setIdioma(String idioma) {
	if (idioma == null)
	    this.idioma = V_IDIOMA;
	else
	    this.idioma = idioma;
    }

    /**
     * @return the reductorX
     */
    public Integer getReductorX() {
	return reductorX;
    }

    /**
     * @param reductorX
     *            the reductorX to set
     */
    public void setReductorX(Integer reductorX) {
	if (reductorX == null)
	    this.reductorX = V_REDUCTOR_X;
	else
	    this.reductorX = reductorX;
    }

    /**
     * @return the reductorY
     */
    public Integer getReductorY() {
	return reductorY;
    }

    /**
     * @param reductorY
     *            the reductorY to set
     */
    public void setReductorY(Integer reductorY) {
	if (reductorY == null)
	    this.reductorY = V_REDUCTOR_Y;
	else
	    this.reductorY = reductorY;
    }

    /**
     * @return the colorLineas
     */
    public Color getColorLineas() {
	return colorLineas;
    }

    /**
     * @param colorLineas
     *            the colorLineas to set
     */
    public void setColorLineas(Color colorLineas) {
	if (colorLineas == null)
	    this.colorLineas = V_COLOR_LINEAS;
	else
	    this.colorLineas = colorLineas;
    }

    /**
     * @return the colorTexto
     */
    public Color getColorTexto() {
	return colorTexto;
    }

    /**
     * @param colorTexto
     *            the colorTexto to set
     */
    public void setColorTexto(Color colorTexto) {
	if (colorTexto == null)
	    this.colorTexto = V_COLOR_TEXTO;
	else
	    this.colorTexto = colorTexto;
    }

    /**
     * @return the colorKm1
     */
    public Color getColorKmImpar() {
	return colorKmImpar;
    }

    /**
     * @param colorKm1
     *            the colorKm1 to set
     */
    public void setColorKmImpar(Color colorKm1) {
	if (colorKm1 == null)
	    this.colorKmImpar = V_COLOR_KM_IMPAR;
	else
	    this.colorKmImpar = colorKm1;
    }

    /**
     * @return the colorKm3
     */
    public Color getColorKmPar() {
	return colorKmPar;
    }

    /**
     * @param colorKm3
     *            the colorKm3 to set
     */
    public void setColorKmPar(Color colorKm3) {
	if (colorKm3 == null)
	    this.colorKmPar = V_COLOR_KM_PAR;
	else
	    this.colorKmPar = colorKm3;
    }

    /**
     * @return the colorHorizonte
     */
    public Color getColorHorizonte() {
	return colorHorizonte;
    }

    /**
     * @param colorHorizonte
     *            the colorHorizonte to set
     */
    public void setColorHorizonte(Color colorHorizonte) {
	if (colorHorizonte == null)
	    this.colorHorizonte = V_COLOR_HORIZONTE;
	else
	    this.colorHorizonte = colorHorizonte;
    }

    /**
     * @return the iconoMarca
     */
    public ImageIcon getIconoMarca() {
	return iconoMarca;
    }

    /**
     * @param iconoMarca
     *            the iconoMarca to set
     */
    public void setIconoMarca(ImageIcon iconoMarca) {
	this.iconoMarca = iconoMarca;
    }

    /**
     * @return the colorLineasSuaves
     */
    public Color getColorLineasSuaves() {
	return colorLineasSuaves;
    }

    /**
     * @param colorLineasSuaves
     *            the colorLineasSuaves to set
     */
    public void setColorLineasSuaves(Color colorLineasSuaves) {
	if (colorLineasSuaves == null)
	    this.colorLineasSuaves = V_COLOR_LINEAS_SUAVES;
	else
	    this.colorLineasSuaves = colorLineasSuaves;
    }

    /**
     * @return the segundosIntervalo
     */
    public Integer getSegundosIntervalo() {
	return segundosIntervalo;
    }

    /**
     * @param segundosIntervalo
     *            the segundosIntervalo to set
     */
    public void setSegundosIntervalo(Integer segundosIntervalo) {
	if (segundosIntervalo == null)
	    this.segundosIntervalo = V_SEGUNDOS_INTERVALO;
	else
	    this.segundosIntervalo = segundosIntervalo;
    }

    /**
     * @return the factorCorreccionAltura
     */
    public Integer getFactorCorreccionAltura() {
	return factorCorreccionAltura;
    }

    /**
     * @param factorCorreccionAltura
     *            the factorCorreccionAltura to set
     */
    public void setFactorCorreccionAltura(Integer factorCorreccionAltura) {
	if (factorCorreccionAltura == null)
	    this.factorCorreccionAltura = V_FACTOR_CORRECCION_ALTURA;
	else
	    this.factorCorreccionAltura = factorCorreccionAltura;
    }

    /**
     * @return the offsetx
     */
    public Integer getOffsetX() {
	return offsetX;
    }

    /**
     * @param offsetx
     *            the offsetx to set
     */
    public void setOffsetX(Integer offsetx) {
	if (offsetx == null)
	    this.offsetX = V_OFFSET_X;
	else
	    this.offsetX = offsetx;
    }

    /**
     * @return the offsety
     */
    public Integer getOffsetY() {
	return offsetY;
    }

    /**
     * @param offsety
     *            the offsety to set
     */
    public void setOffsetY(Integer offsety) {
	if (offsety == null)
	    this.offsetY = V_OFFSET_Y;
	else
	    this.offsetY = offsety;
    }

    /**
     * @return the multiplicador
     */
    public Integer getMultiplicador() {
	return multiplicador;
    }

    /**
     * @param offsety
     *            the offsety to set
     */
    public void setMultiplicador(Integer multiplicador) {
	if (multiplicador == null)
	    this.multiplicador = V_MULTIPLICADOR;
	else
	    this.multiplicador = multiplicador;
    }

    public String getRutaImg() {
	return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
	if (rutaImg == null) {
	    this.rutaImg = V_RUTA_IMG;
	}
	this.rutaImg = rutaImg;
    }

    public Double getCorteNegativoPuertos() {
	return corteNegativoPuertos;
    }

    public void setCorteNegativoPuertos(Double corteNegativoPuertos) {
	this.corteNegativoPuertos = corteNegativoPuertos;
    }

    public Double getMinMetrosPuertos() {
	return minMetrosPuertos;
    }

    public void setMinMetrosPuertos(Double minMetrosPuertos) {
	this.minMetrosPuertos = minMetrosPuertos;
    }

    public Double getMinDesnivelPuertos() {
	return minDesnivelPuertos;
    }

    public void setMinDesnivelPuertos(Double minDesnivelPuertos) {
	this.minDesnivelPuertos = minDesnivelPuertos;
    }

    public Double getKmInicialesPuertos() {
	return kmInicialesPuertos;
    }

    public void setKmInicialesPuertos(Double kmInicialesPuertos) {
	this.kmInicialesPuertos = kmInicialesPuertos;
    }

    public Double getMinDesnivelInicialPuertos() {
	return minDesnivelInicialPuertos;
    }

    public void setMinDesnivelInicialPuertos(Double minDesnivelInicialPuertos) {
	this.minDesnivelInicialPuertos = minDesnivelInicialPuertos;
    }

    public Color getColorUno() {
	return colorUno;
    }

    public void setColorUno(Color colorUno) {
	this.colorUno = colorUno;
    }

    public Color getColorDos() {
	return colorDos;
    }

    public void setColorDos(Color colorDos) {
	this.colorDos = colorDos;
    }

    public Color getColorTres() {
	return colorTres;
    }

    public void setColorTres(Color colorTres) {
	this.colorTres = colorTres;
    }

    public Color getColorCuatro() {
	return colorCuatro;
    }

    public void setColorCuatro(Color colorCuatro) {
	this.colorCuatro = colorCuatro;
    }

    public Color getColorCinco() {
	return colorCinco;
    }

    public void setColorCinco(Color colorCinco) {
	this.colorCinco = colorCinco;
    }

    public Color getColorRampa() {
	return colorRampa;
    }

    public void setColorRampa(Color colorRampa) {
	this.colorRampa = colorRampa;
    }

    public Double getKmUno() {
	return kmUno;
    }

    public void setKmUno(Double kmUno) {
	this.kmUno = kmUno;
    }

    public Double getKmDos() {
	return kmDos;
    }

    public void setKmDos(Double kmDos) {
	this.kmDos = kmDos;
    }

    public Double getKmTres() {
	return kmTres;
    }

    public void setKmTres(Double kmTres) {
	this.kmTres = kmTres;
    }

    public Double getKmCuatro() {
	return kmCuatro;
    }

    public void setKmCuatro(Double kmCuatro) {
	this.kmCuatro = kmCuatro;
    }

    public Double getKmCinco() {
	return KmCinco;
    }

    public void setKmCinco(Double kmCinco) {
	KmCinco = kmCinco;
    }

    public String getColorKm() {
        return colorKm;
    }

    public void setColorKm(String colorKm) {
        this.colorKm = colorKm;
    }

    public Integer getHrZona0() {
        return hrZona0;
    }

    public void setHrZona0(Integer hrZona0) {
        this.hrZona0 = hrZona0;
    }

    public Integer getHrZona1() {
        return hrZona1;
    }

    public void setHrZona1(Integer hrZona1) {
        this.hrZona1 = hrZona1;
    }

    public Integer getHrZona2() {
        return hrZona2;
    }

    public void setHrZona2(Integer hrZona2) {
        this.hrZona2 = hrZona2;
    }

    public Integer getHrZona3() {
        return hrZona3;
    }

    public void setHrZona3(Integer hrZona3) {
        this.hrZona3 = hrZona3;
    }

    public Integer getHrZona4() {
        return hrZona4;
    }

    public void setHrZona4(Integer hrZona4) {
        this.hrZona4 = hrZona4;
    }

    public Integer getHrZona5() {
        return hrZona5;
    }

    public void setHrZona5(Integer hrZona5) {
        this.hrZona5 = hrZona5;
    }

}
