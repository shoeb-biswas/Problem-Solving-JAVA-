public class CPU {
    public void freeze() {
        System.out.println("CPU freezing...");
    }

    public void jump(long position) {
        System.out.println("CPU jumping to position " + position);
    }

    public void execute() {
        System.out.println("CPU executing...");
    }

    public void shutdown() {
        System.out.println("CPU shutting down...");
    }
}

public class Memory {
    public void load(long position, String data) {
        System.out.println("Memory loading " + data + " at position " + position);
    }

    public void clear() {
        System.out.println("Memory clearing data...");
    }
}

public class HardDrive {
    public String read(long lba, int size) {
        return "Data from sector " + lba + " with size " + size;
    }

    public void stop() {
        System.out.println("Hard Drive stopping...");
    }
}

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Starting the computer...");
        cpu.freeze();
        memory.load(0, hardDrive.read(100, 1024));
        cpu.jump(0);
        cpu.execute();
        System.out.println("Computer started successfully.");
    }

    public void shutdown() {
        System.out.println("Shutting down the computer...");
        cpu.shutdown();
        memory.clear();
        hardDrive.stop();
        System.out.println("Computer shut down successfully.");
    }
}

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        // Simulate some operations...
        computer.shutdown();
    }
}
