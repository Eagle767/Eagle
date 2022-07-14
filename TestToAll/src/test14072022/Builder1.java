package test14072022;

public class Builder1 {
	
	public static void main(String[] args) {
		
		Cricket c=new Cricket.Bat("MRF", "SS").To(true).Botto(false).build();
		
		System.out.println(c);
		
		System.out.println(c.MRF()+c.SS()+c.Top()+c.Bottom());
		
	}

}

class Cricket {
	
	private String MRF,SS;
	
	private boolean Top,Bottom;
	
	private Cricket(Bat b) {
		
		this.MRF=b.MRF;
		
		this.SS=b.SS;
		
		this.Top=b.Top;
		
		this.Bottom=b.Bottom;
		
	}
	
	public String MRF() {
		
		return MRF;
		
	}
	
	public String SS() {
		
		return SS;
		
	}
	
	public boolean Top() {
		
		return Top;
		
	}
	
	public boolean Bottom() {
		
		return Bottom;
		
	}
	
	public static class Bat{
		
		private String MRF,SS;
		
		private boolean Top,Bottom;
		
		public Bat(String MRF,String SS) {
			
			this.MRF=MRF;
			
			this.SS=SS;
			
		}
		
		public Cricket build() {
			
			return new Cricket(this);
			
		}
		
		public Bat To(boolean Top) {
			
			this.Top=Top;
			
			return this;
			
		}
		
		public Bat Botto(boolean Bottom) {
			
			this.Bottom=Bottom;
			
			return this;
			
		}
		
	}
	
}