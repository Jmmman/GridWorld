package fib;

/**
 * NumberRockDisplay.java  1/7/2015
 *
 * @author - Jane Doe
 * @author - T4
 *
 */

import info.gridworld.gui.Display;
import info.gridworld.gui.DefaultDisplay;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Graphics2D;

/**
 * Display class that caused the NumberRock object to be drawn with text.
 * It uses the DefaultDisplay which draws the object's text property
 * with a background color given by the object's color property.<br>
 * Otherwise it would be displayed as a Rock since NumberRock
 * inherits from Rock.
 */
public class NumberRockDisplay implements Display
{
	/** Actual display to use for drawing NumberRock objects */
	private DefaultDisplay display;

	/**
	 * Constructs a <code>NumberRockDisplay</code> object..
	 */
    public NumberRockDisplay()
    {
    	display = new DefaultDisplay();
    }

    /**
     * Use the DefaultDisplay object display to draw the given object.
     * DefaultDisplay draws a string with
     * a background color. The background color is the value
     * of the color property, or, if there is no such property
     * and the object is an instance of Color, the object itself.
     * The string is the text property, or if there is no such
     * property, the result of calling toString. The string
     * is clipped to 8 characters.
     * @param obj object we want to draw
     * @param comp component on which to draw
     * @param g2 drawing surface
     * @param rect rectangle in which to draw
     */
    public void draw(
    	Object obj, Component comp, Graphics2D g2, Rectangle rect)
    {
		display.draw(obj, comp, g2, rect);
    }
}