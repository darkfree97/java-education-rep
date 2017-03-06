package sample;

/**
 * Created by Darkfree on 04.12.2016.
 */
public class ParentChild {
    private String parent;
    private String child;
    private boolean access;

    public ParentChild() {
    }

    public ParentChild(String parent, String child, boolean access) {
        this.parent = parent;
        this.child = child;
        this.access = access;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public void setValue(String parent, String child, boolean access) {
        this.parent = parent;
        this.child = child;
        this.access = access;
    }

    @Override
    public String toString() {
        return "Parent : "+this.parent+"\nChild : "+this.child+"\nAccess : "+this.access;
    }
}
