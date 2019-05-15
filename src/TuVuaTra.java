
import java.io.Serializable;
import java.util.Objects;

public class TuVuaTra implements Serializable{ 
// Serializable chuyển đổi các đối tượng thành stream.
    protected String tumoi;
    protected String phienam;
    protected String tiengviet;
// Phương thức get-set

    public String getTumoi() {
        return tumoi;
    }

    public void setTumoi(String tumoi) {
        this.tumoi = tumoi;
    }

    public String getPhienam() {
        return phienam;
    }

    public void setPhienam(String phienam) {
        this.phienam = phienam;
    }

    public String getTiengviet() {
        return tiengviet;
    }

    public void setTiengviet(String tiengviet) {
        this.tiengviet = tiengviet;
    }
}
