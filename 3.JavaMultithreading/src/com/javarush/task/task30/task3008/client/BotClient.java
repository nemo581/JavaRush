package com.javarush.task.task30.task3008.client;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class BotClient extends Client {
    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        int count = (int) (Math.random() * 100);
        String result = "date_bot_" + count;
        return result;
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            System.out.println(message);
            if (message != null && message.contains(":")) {
                String[] substr = message.split(":");
                SimpleDateFormat dateFormat;
                String sendersName = substr[0].trim();
                String messageText = substr[1].trim();
                switch (messageText) {
                    case "дата":
                        dateFormat = new SimpleDateFormat("d.MM.YYYY");
                        sendTextMessage(String.format("Информация для %s: %s", sendersName, dateFormat.format(new GregorianCalendar().getTime())));
                        break;
                    case "день":
                        dateFormat = new SimpleDateFormat("d");
                        sendTextMessage(String.format("Информация для %s: %s", sendersName, dateFormat.format(new GregorianCalendar().getTime())));
                        break;
                    case "месяц":
                        dateFormat = new SimpleDateFormat("MMMM");
                        sendTextMessage(String.format("Информация для %s: %s", sendersName, dateFormat.format(new GregorianCalendar().getTime())));
                        break;
                    case "год":
                        dateFormat = new SimpleDateFormat("YYYY");
                        sendTextMessage(String.format("Информация для %s: %s", sendersName, dateFormat.format(new GregorianCalendar().getTime())));
                        break;
                    case "время":
                        dateFormat = new SimpleDateFormat("H:mm:ss");
                        sendTextMessage(String.format("Информация для %s: %s", sendersName, dateFormat.format(new GregorianCalendar().getTime())));
                        break;
                    case "час":
                        dateFormat = new SimpleDateFormat("H");
                        sendTextMessage(String.format("Информация для %s: %s", sendersName, dateFormat.format(new GregorianCalendar().getTime())));
                        break;
                    case "минуты":
                        dateFormat = new SimpleDateFormat("m");
                        sendTextMessage(String.format("Информация для %s: %s", sendersName, dateFormat.format(new GregorianCalendar().getTime())));
                        break;
                    case "секунды":
                        dateFormat = new SimpleDateFormat("s");
                        sendTextMessage(String.format("Информация для %s: %s", sendersName, dateFormat.format(new GregorianCalendar().getTime())));
                        break;
                    default:
                        break;
                }
                super.processIncomingMessage(message);
            }
        }
    }

    public static void main(String[] args) {
        BotClient bot = new BotClient();
        bot.run();
    }
}
