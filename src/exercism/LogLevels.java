package exercism;

public class LogLevels {
    public String message(String logLine) {
        return logLine.substring(logLine.indexOf(":") + 1).trim();
    }

    public String logLevel(String logLine) {
        int inicio = logLine.indexOf("[") + 1;
        int fim = logLine.indexOf("]");
        return logLine.substring(inicio, fim).toLowerCase();
    }

    public String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

    public static void main(String[] args) {
        LogLevels logLevels = new LogLevels();

        System.out.println(logLevels.message("[ERROR]: Invalid operation"));
        System.out.println(logLevels.logLevel("[ERROR]: Invalid operation"));
        System.out.println(logLevels.reformat("[INFO]: Operation completed"));

    }

}
