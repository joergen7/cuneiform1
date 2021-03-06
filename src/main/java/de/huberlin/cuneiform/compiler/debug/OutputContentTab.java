/*******************************************************************************
 * In the Hi-WAY project we propose a novel approach of executing scientific
 * workflows processing Big Data, as found in NGS applications, on distributed
 * computational infrastructures. The Hi-WAY software stack comprises the func-
 * tional workflow language Cuneiform as well as the Hi-WAY ApplicationMaster
 * for Apache Hadoop 2.x (YARN).
 *
 * List of Contributors:
 *
 * Jörgen Brandt (HU Berlin)
 * Marc Bux (HU Berlin)
 * Ulf Leser (HU Berlin)
 *
 * Jörgen Brandt is funded by the European Commission through the BiobankCloud
 * project. Marc Bux is funded by the Deutsche Forschungsgemeinschaft through
 * research training group SOAMED (GRK 1651).
 *
 * Copyright 2014 Humboldt-Universität zu Berlin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package de.huberlin.cuneiform.compiler.debug;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class OutputContentTab extends JPanel {

	private static final long serialVersionUID = -2289994505870375438L;
	
	public OutputContentTab() {
		
		JSplitPane splitPane;
		JScrollPane outPane;
		JScrollPane errPane;
		
		setLayout( new BorderLayout() );
		
		outPane = new JScrollPane( new JTextArea() );
		outPane.setBorder( BorderFactory.createTitledBorder( "Standard" ) );
		
		errPane = new JScrollPane( new JTextArea() );
		errPane.setBorder( BorderFactory.createTitledBorder( "Error" ) );
		
		splitPane = new JSplitPane( JSplitPane.VERTICAL_SPLIT,
            outPane, errPane );
		
		splitPane.setResizeWeight( .5 );
			
		add( splitPane, BorderLayout.CENTER );

	}

}
