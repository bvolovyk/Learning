package com.yet.spring.core.spring;

//@Configuration
public class LoggerConfig {

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyConfigIn() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//
//    @Resource(name = "consoleEventLogger")
//    private EventLogger consoleEventLogger;
//
//    @Resource(name = "fileEventLogger")
//    private EventLogger fileEventLogger;
//
//    @Resource(name = "combinedEventLogger")
//    private EventLogger combinedEventLogger;
//
//    @Resource(name = "cacheFileEventLogger")
//    private EventLogger cacheEventLogger;
//
//    @Bean
//    public Collection<EventLogger> combinedLoggers() {
//        Collection<EventLogger> loggers = new ArrayList<EventLogger>(2);
//        loggers.add(consoleEventLogger);
//        loggers.add(fileEventLogger);
//        return loggers;
//    }
//
//    @Bean
//    public Map<EventType, EventLogger> loggerMap() {
//        Map<EventType, EventLogger> map = new EnumMap<>(EventType.class);
//        map.put(EventType.INFO, consoleEventLogger);
//        map.put(EventType.ERROR, combinedEventLogger);
//        return map;
//    }
//
//    @Bean
//    public EventLogger defaultLogger() {
//        return cacheEventLogger;
//    }

}