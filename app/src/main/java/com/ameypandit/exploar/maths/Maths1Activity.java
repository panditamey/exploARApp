package com.ameypandit.exploar.maths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.ameypandit.exploar.R;
import com.google.ar.core.Anchor;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.BaseArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

public class Maths1Activity extends AppCompatActivity {
    private com.google.ar.sceneform.ux.ArFragment ArFragment;
    private ModelRenderable modelRenderable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArFragment = (com.google.ar.sceneform.ux.ArFragment) getSupportFragmentManager().findFragmentById(R.id.maths1frag);
        setUpModel();
        setUpPlane();
    }
    private void setUpPlane() {
        ArFragment.setOnTapArPlaneListener(new BaseArFragment.OnTapArPlaneListener() {
            @Override
            public void onTapPlane(HitResult hitResult, Plane plane, MotionEvent motionEvent) {
                Anchor anchor = hitResult.createAnchor();
                AnchorNode anchorNode = new AnchorNode(anchor);
                anchorNode.setParent(ArFragment.getArSceneView().getScene());
                createModel(anchorNode);
            }
        });
    }

    private void createModel(AnchorNode anchorNode) {
        TransformableNode node = new TransformableNode(ArFragment.getTransformationSystem());
        node.setParent(anchorNode);
        node.setRenderable(modelRenderable);
        node.select();
    }

    private void setUpModel() {
        ModelRenderable.builder()
                .setSource(this,R.raw.maths)
                .build()
                .thenAccept(renderable -> modelRenderable = renderable)
                .exceptionally(throwable -> {
                    Toast.makeText(this, "Can't Load Model", Toast.LENGTH_SHORT).show();
                    return null;
                });
    }
}