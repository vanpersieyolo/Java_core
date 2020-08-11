package TestSkill2;

public class FactoryTools {
    String nameTools;

    public FactoryTools(String nameTools){
        this.nameTools= nameTools;
    }

    public String getNameTools() {
        return nameTools;
    }

    public void setNameTools(String nameTools) {
        this.nameTools = nameTools;
    }

    @Override
    public String toString() {
        return "Dụng cụ: " + nameTools;

    }
}
