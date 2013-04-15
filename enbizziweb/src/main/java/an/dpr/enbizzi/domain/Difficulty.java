package an.dpr.enbizzi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Difficulty {

    private Long difficultyId;
    private String name;
    /**
     * @return the difficultyId
     */
    @Id
    @Column
    public Long getDifficultyId() {
        return difficultyId;
    }
    /**
     * @param difficultyId the difficultyId to set
     */
    public void setDifficultyId(Long difficultyId) {
        this.difficultyId = difficultyId;
    }
    /**
     * @return the name
     */
    @Column
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
