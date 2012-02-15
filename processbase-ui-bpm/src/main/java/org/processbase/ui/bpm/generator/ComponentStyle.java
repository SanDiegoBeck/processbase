/**
 * Copyright (C) 2011 PROCESSBASE Ltd.
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation
 * version 2.1 of the License.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, see <http://www.gnu.org/licenses/>.
 */
package org.processbase.ui.bpm.generator;

/**
 *
 * @author abychkov
 */
public class ComponentStyle {

    private String name;
    private Position position;
    private CSSProperty css;

    public ComponentStyle(String Name){
	this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

     /**
     * @return the position
     */
    public Position getPosition() {
	return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
	this.position = position;
    }

    /**
     * @return the css
     */
    public CSSProperty getCss() {
	return css;
    }

    /**
     * @param css the css to set
     */
    public void setCss(CSSProperty css) {
	this.css = css;
    }


}
