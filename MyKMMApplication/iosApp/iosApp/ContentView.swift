import SwiftUI
import sharedKMM

struct ContentView: View {
	let greet = Greeting().greeting()
let math = Greeting().mathTest()
	var body: some View {
    //    math()
    Text(greet)
	Text(math)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
	ContentView()
	}
}