var blipp = require('blippar').blipp;
var scene = blipp.addScene();

var mW = blipp.getMarker().getWidth();
var mH = blipp.getMarker().getHeight();
var sW = blipp.getScreenWidth() * 1.003;
var sH = blipp.getScreenHeight() * 1.003;

scene.onCreate = function() {
    var Text = scene.getScreen().addSprite().setType('aura')
            .setTexture(['L_Text.png', 'L_Outline.png']).setScale((sW*3)/4);
    var WidthText = scene.getScreen().addSprite().setType('aura')
	    .setTexture().setScale((sW*3)/4);
}