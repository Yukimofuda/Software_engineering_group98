public final class DemoMetadata {
    public static final String APP_TITLE = "BUPT TA Recruitment System";
    public static final String APP_SUBTITLE = "Teaching Assistant Recruitment Demo";
    public static final String VERSION_LABEL = "ver_1.2";
    public static final String ITERATION_NOTE = "Current focus: align the demo more closely with the task plan by strengthening L2 authentication flow and using a shared dashboard framework.";
    public static final String NEXT_STEP_NOTE = "Planned next steps: move remaining business logic into clearer service classes, add deeper tests, and complete the remaining task-plan items for later layers.";

    private DemoMetadata() {
    }

    public static String buildAboutMessage() {
        return APP_TITLE + "\n"
                + VERSION_LABEL + "\n\n"
                + ITERATION_NOTE + "\n"
                + NEXT_STEP_NOTE;
    }
}
