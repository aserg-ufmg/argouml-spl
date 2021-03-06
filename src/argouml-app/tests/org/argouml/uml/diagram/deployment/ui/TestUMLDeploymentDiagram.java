// $Id: TestUMLDeploymentDiagram.java 43 2010-04-03 20:28:12Z marcusvnac $
// Copyright (c) 1996-2007 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.uml.diagram.deployment.ui;

import junit.framework.TestCase;
import org.argouml.model.InitializeModel;
import org.argouml.profile.init.InitProfileSubsystem;

import org.argouml.uml.diagram.deployment.DeploymentDiagramGraphModel;


/**
 * General test methods for UMLDeploymentDiagrams
 */
public class TestUMLDeploymentDiagram extends TestCase {

    /**
     * The constructor.
     *
     * @param name the test name
     */
    public TestUMLDeploymentDiagram(String name) {
	super(name);
    }

    /*
     * @see junit.framework.TestCase#setUp()
     */
    public void setUp() throws Exception {
	super.setUp();
        InitializeModel.initializeDefault();
        new InitProfileSubsystem().init();
    }

    /**
     * Test the UMLDeploymentDiagram emtpy constructor.
     * The graph model should always be a DeploymentDiagramGraphModel
     */
    public void testUMLDeploymentDiagram() {
	UMLDeploymentDiagram diagram = new UMLDeploymentDiagram();
	assertTrue(diagram.getGraphModel()
		instanceof DeploymentDiagramGraphModel);
    }
}
