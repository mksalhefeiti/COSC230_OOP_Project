package storage;

// a data file is broken. the message says which file, which line and what's wrong
// e.g. Could not read data/jobs.csv (line 7: bad date "16-11-26")
public class DataFileException extends Exception {

    public DataFileException(String file, int line, String problem) {
        super("Could not read " + file + " (line " + line + ": " + problem + ").\n"
                + "The file was not loaded. Fix or remove it, then restart.");
    }
}
