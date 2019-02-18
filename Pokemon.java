public class Pokemon implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
	private String name;
    private Boolean state;
    private Integer healthPoint;
    private Integer attackPoint;

    // constructor
    public Pokemon(String name, Boolean state, Integer healthPoint, Integer attackPoint) {
        this.name = name;
        this.state = state;
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }

    // Getter methods
    public String getName(){
        return this.name;
    }
    public Boolean getState(){
        return this.state;
    }
    public Integer getHealthPoint(){
        return this.healthPoint;
    }
    public Integer getAttackPoint(){
        return this.attackPoint;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setState(Boolean state) {
        this.state = state;
    }
    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }
    public void setAttackPoint(Integer attackPoint) {
        this.attackPoint = attackPoint;
    }

}