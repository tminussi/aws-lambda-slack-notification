package br.com.bluesoft.model;

import java.util.List;

public class SlackWebHook {

    private String username;

    private String text;

    private String icon_emoji;

    private List<News> attachments;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon_emoji() {
        return icon_emoji;
    }

    public void setIcon_emoji(String icon_emoji) {
        this.icon_emoji = icon_emoji;
    }

    public List<News> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<News> attachments) {
        this.attachments = attachments;
    }

    public static class SlackWebHookBuilder {

        private SlackWebHook slackWebHook = new SlackWebHook();

        public SlackWebHookBuilder withUsername() {
            this.slackWebHook.setUsername("TopNews");
            return this;
        }

        public SlackWebHookBuilder withText() {
            this.slackWebHook.setText("Artigos e Noticias relacionados a Ciencia e Tecnologia mais visualizados nos ultimos dias");
            return this;
        }

        public SlackWebHookBuilder withIconEmoji() {
            this.slackWebHook.setIcon_emoji(":robot_face:");
            return this;
        }

        public SlackWebHookBuilder withAttachments(List<News> news) {
            this.slackWebHook.setAttachments(news);
            return this;
        }

        public SlackWebHook build() {
            return slackWebHook;
        }
    }
}
