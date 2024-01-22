import java.util.ArrayList;
import java.util.List;

public class GlobalsBlock {
    private List<GlobalVar> globalVars = new ArrayList<>();

    public List<GlobalVar> getGlobalVars() {
        return globalVars;
    }

    public void setGlobalVars(List<GlobalVar> globalVars) {
        this.globalVars = globalVars;
    }

    public GlobalsBlock() {
    }
}
