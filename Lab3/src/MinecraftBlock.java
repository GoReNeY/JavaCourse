import java.util.Objects;

public class MinecraftBlock {

    private int id;
    private String name;
    private double hardness;
    private double weight;
    private double lightLevel;

    /**
     * Constructor for creating a MinecraftBlock object.
     *
     * @param id         the id of the block
     * @param name       the name of the block
     * @param hardness   the hardness of the block
     * @param weight     the weight of the block
     * @param lightLevel the light level of the block
     */
    public MinecraftBlock(int id, String name, double hardness, double weight, int lightLevel) {
        this.id = id;
        this.name = name;
        this.hardness = hardness;
        this.weight = weight;
        this.lightLevel = lightLevel;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String color) {
        this.name = name;
    }

    public double getHardness() {
        return this.hardness;
    }
    
    public void setHardness(double hardness) {
        this.hardness = hardness;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getLightLevel() {
        return this.lightLevel;
    }
    
    public double setLightLevel(int lightLevel) {
        return this.lightLevel = lightLevel;
    }

    // Overriding base equals method for our class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MinecraftBlock other = (MinecraftBlock) obj;
        return id == other.id && name.equals(other.name)
                && Double.compare(hardness, other.hardness) == 0
                && Double.compare(weight, other.weight) == 0
                && Double.compare(lightLevel, other.lightLevel) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hardness, weight, lightLevel);
    }

    @Override
    public String toString() {
        return "MinecraftBlock{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hardness=" + hardness +
                ", weight=" + weight +
                ", lightLevel=" + lightLevel +
                '}';
    }
}
