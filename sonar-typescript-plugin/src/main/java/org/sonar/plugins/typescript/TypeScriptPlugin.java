/*
 * SonarQube TypeScript Plugin
 * Copyright (C) 2015 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.typescript;

import com.google.common.collect.ImmutableList;

import org.sonar.api.SonarPlugin;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.plugins.typescript.core.TypeScript;

import java.util.List;

public class TypeScriptPlugin extends SonarPlugin {

  // Global TypeScript constants
  public static final String FALSE = "false";

  public static final String FILE_SUFFIXES_KEY = "sonar.typescript.file.suffixes";
  public static final String FILE_SUFFIXES_DEFVALUE = ".ts";

  public static final String PROPERTY_PREFIX = "sonar.typescript";

  @Override
  public List getExtensions() {
    return ImmutableList.of(
        TypeScript.class,

        PropertyDefinition.builder(FILE_SUFFIXES_KEY)
          .defaultValue(FILE_SUFFIXES_DEFVALUE)
          .name("File Suffixes")
          .description("Comma-separated list of suffixes for files to analyze.")
          .build()
    );
  }

}
