package Baby_level;

public class _20c_Enums_Functions {
    private enum Signal {
        RED("Ruk jaa bhai") {
            @Override
            void baklolKaro() {
                System.out.println("Bhai LAAL hai ruk jaa 😭😭");
            }
        },
        YELLOW("Gaadi Shuru kar") {
            @Override
            void baklolKaro() {
                System.out.println("Bhai engine on kar, apna time aane wala hai 😁😁");
            }
        },
        GREEN("Nikal .. pehele fursat mein nikal") {
            @Override
            void baklolKaro() {
                System.out.println("lagao Accelerator 😎😎");
            }
        };

        private final String action;
        Signal(String action) {
            this.action = action;
        }

        String getAction(){
            return action;
        }

        void shoutAction() {
            System.out.println(getAction());
        }

        abstract void baklolKaro();
    }

    public static void main(String[] args) {
        Signal.RED.shoutAction();

        System.out.println("Baklolgiri shuru");
        for (Signal s : Signal.values())
            s.baklolKaro();

    }
}
