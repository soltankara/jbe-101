    package Module02.Session13;

    public class StringToIntegerException extends RuntimeException {
        private final String message;

        public StringToIntegerException(String message) {
            this.message = message;
        }
        public StringToIntegerException(Throwable cause, String message) {
            super(cause);
            this.message = message;
        }

        @Override
        public String getMessage() {
            return message;
        }
    }
