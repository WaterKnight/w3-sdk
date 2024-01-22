import java.util.ArrayList;
import java.util.List;

public class Func {
    private boolean isConstant;
    private String name;
    private List<Parameter> parameters = new ArrayList<>();
    private String returnType;
    private FuncBody funcBody;

    public boolean isConstant() {
        return isConstant;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public FuncBody getFuncBody() {
        return funcBody;
    }

    public void setFuncBody(FuncBody funcBody) {
        this.funcBody = funcBody;
    }
}
