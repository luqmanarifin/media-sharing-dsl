/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package media.sharing.dsl

/**
 *
 * @author Luqman A. Siswanto
 */

// Load file Translator.groovy
def script = new GroovyScriptEngine( '.' ).with {
  loadScriptByName( 'src/media/sharing/dsl/Translator.groovy' )
} 
this.metaClass.mixin script


// Domain specific language