package jamp;

public class PlayerConcrete implements Player {
	protected boolean isPlayingNow = false;

	@Override
	public boolean isPlaying() {
		return isPlayingNow;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		isPlayingNow = true;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		isPlayingNow = false;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prev() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fastForward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rewind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void report() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void about() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		stop();
		System.exit(0);
	}

}
