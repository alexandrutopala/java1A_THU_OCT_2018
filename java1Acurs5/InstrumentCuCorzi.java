@FunctionalInterface
public interface InstrumentCuCorzi extends Instrument, Coarda {
    @Override
    default void incanta() {
        System.out.println("Ou lala");
    }
}