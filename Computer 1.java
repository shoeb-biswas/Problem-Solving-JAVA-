public interface Computer {
    String assemble();
}

public class BasicComputer implements Computer {
    @Override
    public String assemble() {
        return "Basic Computer";
    }
}

public abstract class ComputerDecorator implements Computer {
    protected Computer decoratedComputer;

    public ComputerDecorator(Computer computer) {
        this.decoratedComputer = computer;
    }

    @Override
    public String assemble() {
        decoratedComputer = new BasicComputer(); 
        return decoratedComputer.assemble();
    }
}

public class GamingComputer extends ComputerDecorator {
    public GamingComputer(Computer computer) {
        super(computer);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Gaming Features";
    }
}

public class WorkstationComputer extends ComputerDecorator {
    public WorkstationComputer(Computer computer) {
        super(computer);
    }

    @Override
    public String assemble() {
        return super.assemble() + " + Workstation Features";
    }
}

public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer(new BasicComputer());
        System.out.println(gamingComputer.assemble()); // Expected: Basic Computer + Gaming Features

        Computer workstationComputer = new WorkstationComputer(new BasicComputer());
        System.out.println(workstationComputer.assemble()); // Expected: Basic Computer + Workstation Features
    }
}
