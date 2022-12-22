package dependencyInject;

public abstract class Toy implements IUse,NoUse {
	private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
