/*
 *  Copyright (c) 2013,
 *      Tobias Blaschke <code@tobiasblaschke.de>
 *  All rights reserved.

 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 *
 *  3. The names of the contributors may not be used to endorse or promote
 *     products derived from this software without specific prior written
 *     permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 *  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 *  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 *  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 *  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 *  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 *  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 *  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 *  POSSIBILITY OF SUCH DAMAGE.
 */
/**
 *  Read and Write the entryPoints-File (XML).
 *
 *  The read and generated by this package actually contains a bit more than only the entrypoints:
 *
 *  * The Entrypoints
 *  * The behavior of to instantiate parameters to the entrypoints (see: IInstantiationBehavior)
 *  * Intents seen and where their target is
 *
 *  Writing the file
 *  ----------------
 *  
 *      The Serializer collects the information from the objects in WALA, while doing that it instructs
 *      the Marshall to insert Marshall.Document.Nodes into the Marshall.Document.
 *
 *      Finally the Document (which consists of a tree of Nodes which again consist of Tags and Attributes)
 *      can be instructed to write out itself on a XMLStreamWriter.
 *  
 *  Reading the file
 *  ----------------
 *
 *      A file is read using the SAX-Library. Tags contains all recognized Tags and Attributes and their 
 *      allowed disposition. All Tags.Tag have an Items.ParserItem associated with them. Once a Tag is 
 *      encountered when reading, the ParserItem handles it: It builds up a stack, ...
 *
 *      The XML-File is _not_ read into a tree-structure instead the data is unpacked from their 
 *      respective String-representations and get inserted _directly_ into the WALA-structures.
 *
 *  @author Tobias Blaschke <code@tobiasblaschke.de>
 *  @since  2013-10-26
 */
package edu.kit.joana.wala.jodroid.entrypointsFile;