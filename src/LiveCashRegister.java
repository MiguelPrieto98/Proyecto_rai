import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Caja en directo (proyecto A01.5). Esqueleto: completad los TODO en la fase 4.
 * Se adapta del ProductorConsumidor del ejemplo 8.4.
 *
 * Productor-consumidor entre dos procesos unidos por una tubería: la caja
 * (CashRegister) emite
 * tickets y el registro (Ledger) los suma.
 *
 * Uso: java LiveCashRegister
 */
public class LiveCashRegister {
    static final String SCENARIO_ONE = " Escenario 1, caja lenta y registro rápido: 5 tickets; pausa de la caja, 500 ms, y del registro, 0";
    final static String TICKET_S_ONE = "5";
    final static String PAUSE_CASH_ONE = "500";
    final static String PAUSE_LEDGER_ONE = "0";
    static final String SCENARIO_TWO = "Escenario 2, caja rápida y registro lento: 10 tickets; pausa de la caja, 0, y del registro, 300 ms.";
    final static String TICKET_S_TWO = "10";
    final static String PAUSE_CASH_TWO = "0";
    final static String PAUSE_LEDGER_TWO = "300";

    public static void main(String[ ] args) throws IOException, InterruptedException {
        // TODO fase 4: ejecutar los dos escenarios con runScenario(), escribiendo antes
        // cuál es.
        // Escenario 1, caja lenta y registro rápido: 5 tickets; pausa de la caja, 500
        // ms,
        // y del registro, 0.
        // Escenario 2, caja rápida y registro lento: 10 tickets; pausa de la caja, 0, y
        // del
        // registro, 300 ms.
        System.out.println(SCENARIO_ONE);
        runScenario(TICKET_S_ONE, PAUSE_CASH_ONE, PAUSE_LEDGER_ONE);
        System.out.println(SCENARIO_TWO);
        runScenario(TICKET_S_TWO, PAUSE_CASH_TWO, PAUSE_LEDGER_TWO);
    }

    /**
     * Lanza una CashRegister y un Ledger unidos por una tubería con
     * ProcessBuilder.startPipeline()
     * y espera a los dos. Las trazas de los dos (salida de error) y el total del
     * Ledger (salida
     * estándar) se ven en la consola del padre.
     *
     * @param tickets       número de tickets que emite la caja
     * @param registerPause pausa de la caja antes de cada ticket, en ms
     * @param ledgerPause   pausa del registro después de cada ticket, en ms
     */
    static final String CASH = "CashRegister";
    static final String LEDGER = "Ledger";

    static void runScenario(String tickets, String registerPause, String ledgerPause)
            throws IOException, InterruptedException {
        // TODO fase 4
        ProcessBuilder cash = new ProcessBuilder(javaCommand(CASH, tickets, registerPause));
        ProcessBuilder ledger = new ProcessBuilder(javaCommand(LEDGER, ledgerPause));
        cash.redirectError(ProcessBuilder.Redirect.INHERIT);
        ledger.redirectError(ProcessBuilder.Redirect.INHERIT);
        ledger.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        List<Process> proces = ProcessBuilder.startPipeline(List.of(cash, ledger));
        for (Process p : proces) {
            p.waitFor();
        }
    }

    /**
     * Construye el comando que ejecuta la clase indicada con la misma JVM y el
     * mismo classpath que
     * este programa. Ya está hecho: es el comandoJava del ejemplo 6.3.
     */
    static final String JAVA_FILE = "java.home";
    static final String BIN_FILE = "bin";
    static final String JAVA = "java";
    static final String COMMAND = "-cp";
    static final String JAVA_PATH = "java.class.path";

    static List<String> javaCommand(String className, String... arguments) {
        List<String> command = new ArrayList<>();
        command.add(Path.of(System.getProperty(JAVA_FILE), BIN_FILE, JAVA).toString());
        command.add(COMMAND);
        command.add(System.getProperty(JAVA_PATH));
        command.add(className);
        for (String argument : arguments) {
            command.add(argument);
        }
        return command;
    }
}
