public static Runnable createRunnable(String text, int repeats) {
    return new java.lang.Runnable () {
        @Override
        public void run() {
            for (int i = 0; i < repeats; i++) {
                System.out.println(text);
        }
        }
    };
}