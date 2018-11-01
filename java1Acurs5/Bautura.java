public enum Bautura {
    SUC{
        @Override
        void m() {
            // some code
        }
    }, 
    BERE{
        @Override
        void m() {
            // some other code
        }
    };
    
    
    abstract void m();
}