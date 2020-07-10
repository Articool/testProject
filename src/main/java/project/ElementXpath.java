package project;

public class ElementXpath {


    /**
     * buttonClass()
     * Шаблон элемента xpath
     * button[@class="Вставляемый текст"]
     */
    public static String buttonClass(String text) {
        return "//button[@class='" + text + "']";
    }

    /**
     * divText()
     * Шаблон элемента xpath
     * div[text()="Вставляемый текст"]
     */
    public static String divText(String text) {
        return "//div[text()='" + text + "']";
    }

    /**
     * divClass()
     * Шаблон элемента xpath
     * divClass[@class="Вставляемый текст"]
     */

    public static String divClass(String text) {
        return "//div[@class='" + text + "']";
    }

    /**
     * spanText()
     * Шаблон элемента xpath
     * span[text()="Вставляемый текст"]
     */

    public static String spanText(String text) {
        return "//span[text()='" + text + "']";
    }

    /**
     * spanClass()
     * Шаблон элемента xpath
     * spanClass[@class="Вставляемый текст"]
     */

    public static String spanClass(String text) {
        return "//span[@class='" + text + "']";
    }

    /**
     * inputName()
     * Шаблон элемента xpath
     * input[@name="Вставляемый текст"]
     */

    public static String inputName(String text) {
        return "//input[@name='" + text + "']";
    }

    /**
     * inputPlaceholder()
     * Шаблон элемента xpath
     * inputPlaceholder[@placeholder="Вставляемый текст"]
     */

    public static String inputPlaceholder(String text) {
        return "//input[@placeholder='" + text + "']";
    }

    /**
     * inputValue()
     * Шаблон элемента xpath
     * inputValue[@value="Вставляемый текст"]
     */

    public static String inputValue(String text) {
        return "//input[@value='" + text + "']";
    }

    /**
     * inputClass()
     * Шаблон элемента xpath
     * inputClass[@class="Вставляемый текст"]
     */

    public static String inputClass(String text) {
        return "//input[@class='" + text + "']";
    }


    /**
     * iFrame()
     * Шаблон элемента xpath
     * iframe[@class="Вставляемый текст"]
     */

    public static String iFrame(String text) {
        return "//iframe[@class='" + text + "']";
    }

    /**
     * pText()
     * Шаблон элемента xpath
     * p[text()="Вставляемый текст"]
     */

    public static String pText(String text) {
        return "//p[text()='" + text + "']";
    }

    /**
     * textareaPlaceholder()
     * Шаблон элемента xpath
     * textarea[@placeholder="Вставляемый текст"]
     */

    public static String textareaPlaceholder(String text) {
        return "//textarea[@placeholder='" + text + "']";
    }

    /**
     * textareaClass()
     * Шаблон элемента xpath
     * textarea[@class="Вставляемый текст"]
     */

    public static String textareaClass(String text) {
        return "//textarea[@class='" + text + "']";
    }
//textarea[@class='step-two__text-input step-two__text-input_req-description']
}
