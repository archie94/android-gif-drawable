package pl.droidsonroids.gif.sample

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.texture.*

class GifTextureFragment : Fragment() {

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
			inflater.inflate(R.layout.texture, container, false)

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		if (!gifTextureView.isHardwareAccelerated) {
			textTextureViewStub.visibility = View.VISIBLE
		} else {
			Handler().postDelayed({
				gifTextureView.setInputSource(null)
				gifImageView.setImageDrawable(null)
			}, 5_000)
		}
	}
}
