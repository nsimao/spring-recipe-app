package guru.springframework.controllers;

import guru.springframework.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@ControllerAdvice
public class ControllerExceptionHandler {
// -------------------------- OTHER METHODS --------------------------

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView handleNotFound(Exception exception) {
        return getModelAndView(exception, "404error");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NumberFormatException.class)
    public ModelAndView handleNumberFormat(Exception exception) {
        return getModelAndView(exception, "400error");
    }

    private ModelAndView getModelAndView(Exception exception, String viewName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(viewName);
        modelAndView.addObject("exception", exception);
        return modelAndView;
    }
}
