
        public class Token {
        public static final String IDENTIFIER = "IDENTIFIER";
        public static final String NUMBER = "NUMBER";
        public static final String STRING = "STRING";
        public static final String KEYWORD = "KEYWORD";
        public static final String OPERATOR = "OPERATOR";
        public static final String DELIMETER = "DELIMETER";
        public static final String EOF = "EOF";

        private final String type;
        private final String value;

        public Token(String type, String value) {
            this.type = type;
            this.value = value;
        }

        public String getType() {
                return this.type;
            }


            public String getValue() {
                return this.value;
            }

            public String toString() {
                return "Token{" + "type='" + type + '\'' + ", value='" + value + '\'' + '}';
            }
            
}

