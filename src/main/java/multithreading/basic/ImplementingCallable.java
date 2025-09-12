package multithreading.basic;

import java.util.concurrent.Callable;

public class ImplementingCallable implements Callable {

    @Override
    public String call() throws Exception {

           return "Subham";
    }
}
