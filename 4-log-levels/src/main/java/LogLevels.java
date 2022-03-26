public class LogLevels {

    public static String message(String logLine) {
        String message = logLine.split(":")[1];
        return message.trim();
    }

    public static String logLevel(String logLine) {
        String logLevel = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        return logLevel.toLowerCase();
    }

    public static String reformat(String logLine) {
        String logLevel = LogLevels.logLevel(logLine);
        String message = LogLevels.message(logLine);
        String result = message + " (" + logLevel + ")";
        return result;
    }
}
