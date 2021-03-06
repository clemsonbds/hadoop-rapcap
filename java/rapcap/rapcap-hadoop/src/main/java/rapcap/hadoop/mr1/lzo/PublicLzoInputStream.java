package rapcap.hadoop.mr1.lzo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.hadoop.io.compress.Decompressor;

import com.hadoop.compression.lzo.LzopInputStream;

// wrapper class for LzopInputStream because decompress is protected.

public class PublicLzoInputStream extends LzopInputStream {

	public PublicLzoInputStream(InputStream in, Decompressor decompressor, int bufferSize) throws IOException {
		super(in, decompressor, bufferSize);
	}

	@Override
	public int decompress(byte[] b, int off, int len) throws IOException {
		return super.decompress(b, off, len);
	}
}
