package my.camel;

import org.apache.camel.*;
import org.apache.camel.spi.Synchronization;
import org.apache.camel.spi.UnitOfWork;

import java.util.List;
import java.util.Map;

/**
 * Created by sanket on 10/28/2014.
 */
public class AbstractExchange implements Exchange {

    @Override
    public ExchangePattern getPattern() {
        return null;
    }

    @Override
    public void setPattern(ExchangePattern exchangePattern) {

    }

    @Override
    public Object getProperty(String s) {
        return null;
    }

    @Override
    public Object getProperty(String s, Object o) {
        return null;
    }

    @Override
    public <T> T getProperty(String s, Class<T> tClass) {
        return null;
    }

    @Override
    public <T> T getProperty(String s, Object o, Class<T> tClass) {
        return null;
    }

    @Override
    public void setProperty(String s, Object o) {

    }

    @Override
    public Object removeProperty(String s) {
        return null;
    }

    @Override
    public Map<String, Object> getProperties() {
        return null;
    }

    @Override
    public boolean hasProperties() {
        return false;
    }

    @Override
    public Message getIn() {
        return null;
    }

    @Override
    public <T> T getIn(Class<T> tClass) {
        return null;
    }

    @Override
    public void setIn(Message message) {

    }

    @Override
    public Message getOut() {
        return null;
    }

    @Override
    public <T> T getOut(Class<T> tClass) {
        return null;
    }

    @Override
    public boolean hasOut() {
        return false;
    }

    @Override
    public void setOut(Message message) {

    }

    @Override
    public Exception getException() {
        return null;
    }

    @Override
    public <T> T getException(Class<T> tClass) {
        return null;
    }

    @Override
    public void setException(Throwable throwable) {

    }

    @Override
    public boolean isFailed() {
        return false;
    }

    @Override
    public boolean isTransacted() {
        return false;
    }

    @Override
    public Boolean isExternalRedelivered() {
        return null;
    }

    @Override
    public boolean isRollbackOnly() {
        return false;
    }

    @Override
    public CamelContext getContext() {
        return null;
    }

    @Override
    public Exchange copy() {
        return null;
    }

    @Override
    public Endpoint getFromEndpoint() {
        return null;
    }

    @Override
    public void setFromEndpoint(Endpoint endpoint) {

    }

    @Override
    public String getFromRouteId() {
        return null;
    }

    @Override
    public void setFromRouteId(String s) {

    }

    @Override
    public UnitOfWork getUnitOfWork() {
        return null;
    }

    @Override
    public void setUnitOfWork(UnitOfWork unitOfWork) {

    }

    @Override
    public String getExchangeId() {
        return null;
    }

    @Override
    public void setExchangeId(String s) {

    }

    @Override
    public void addOnCompletion(Synchronization synchronization) {

    }

    @Override
    public boolean containsOnCompletion(Synchronization synchronization) {
        return false;
    }

    @Override
    public void handoverCompletions(Exchange exchange) {

    }

    @Override
    public List<Synchronization> handoverCompletions() {
        return null;
    }
}
