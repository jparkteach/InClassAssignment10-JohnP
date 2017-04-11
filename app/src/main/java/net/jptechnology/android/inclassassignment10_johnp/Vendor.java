package net.jptechnology.android.inclassassignment10_johnp;

public class Vendor {
    public String name;
    public String info;
    public int logoId;

    public Vendor(String name, String info, int logoId) {
        this.name = name;
        this.info = info;
        this.logoId = logoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getLogoId() {
        return logoId;
    }

    public void setLogoId(int logoId) {
        this.logoId = logoId;
    }
}
