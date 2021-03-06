/**
 * Copyright (C) 2009 - 2019 <a href="https://www.wudsn.com" target="_top">Peter Dell</a>
 *
 * This file is part of WUDSN IDE.
 * 
 * WUDSN IDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * WUDSN IDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with WUDSN IDE.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.wudsn.ide.asm.preferences.test;

import com.wudsn.ide.asm.Hardware;
import com.wudsn.ide.asm.preferences.AssemblerPreferencesCompilersPage;

/**
 * Visual editor page for the assembler preferences regarding arbitrary
 * compilers.
 * 
 * @author Peter Dell
 * 
 */
public final class AssemblerPreferencesTestCompilersPage extends AssemblerPreferencesCompilersPage {

    /**
     * Create is public. Used by extension point
     * "org.eclipse.ui.preferencePages".
     */
    public AssemblerPreferencesTestCompilersPage() {
	super(Hardware.TEST);

    }

}