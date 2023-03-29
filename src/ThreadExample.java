public class ThreadExample extends Thread {

    @Override
    public void run() {

        System.out.println("Начало работы потока " + getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + getName() +  " завершил работу.");
    }
}


