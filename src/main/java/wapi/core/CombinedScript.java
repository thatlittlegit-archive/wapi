package wapi.core;

public class CombinedScript {
    public String searchRoot;
    public List<String> scripts = new ArrayList<>();
    public String scriptType = "JavaScript";

    public void add(String script) {
        scripts.add(script);
    }

    public void addFile(String relativeFile) throws FileNotFoundException {
        if(searchRoot == null) {
            throw new FileNotFoundException("Could not find script file!");
        }
        Scanner in = new Scanner(new FileReader(searchRoot + "/" + relativeFile));
        String script = "";
        while(in.hasNext) {
            script = script + in.next();
        }
        scripts.add(script);
    }

    public void runScript() {
        String finalCommand = "";
        for(int counter = 0; scripts.get(counter) != null; counter += 1) {
            finalCommand += scripts.get(counter);
        }
        new ScriptEngineManager().getEngineByName(scriptType).eval(finalCommand);
    }
}
