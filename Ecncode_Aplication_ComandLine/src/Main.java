
	
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Main{
	List<ConvertToMp3Thread> listOfThreads = new ArrayList<>();
	String destination;
	
//	@Override
//	public void start(Stage primaryStage) {
//		try {
//			ScrollPane scrollPanel = new ScrollPane();
//			VBox root = new VBox();
//			Button selectFile = new Button("Select File");
//			selectFile.setDisable(true);
//			Text text = new Text();
//			Button selectDestination = new Button("Select Destiation");
//			FileChooser fileChooser = new FileChooser();
//			fileChooser.setTitle("Open Resource File");
//			
//			final DirectoryChooser directoryChooser = new DirectoryChooser();
//			
//			selectDestination.setOnAction(new EventHandler<ActionEvent>() {
//				@Override
//				public void handle(ActionEvent event) {
//					File file = directoryChooser.showDialog(primaryStage);
//					destination = file.getAbsolutePath();
//					selectFile.setDisable(false);
//				}
//			});
//			
//			selectFile.setOnAction(new EventHandler<ActionEvent>() {
//				@Override
//				public void handle(ActionEvent event) {
//					List<File> list = fileChooser.showOpenMultipleDialog(primaryStage);
//	                    if (list != null) {
//	                    	ControllerThreads cT = new ControllerThreads(list, destination, text);
//	                    }
//				}
//			});
//
//			root.getChildren().addAll(selectDestination);
//			root.getChildren().addAll(selectFile);
//			root.getChildren().addAll(scrollPanel);
//			root.setAlignment(Pos.CENTER);
//		
//			Scene scene = new Scene(root,400,400);
//			text.wrappingWidthProperty().bind(scene.widthProperty());
//			
//			scrollPanel.setFitToWidth(true);
//			scrollPanel.setContent(text);
//			scrollPanel.setMinHeight(100);
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		String path = args[0];
		String destination = args[1];
		List<File> list = new ArrayList();
		final File folder = new File(path);
		//final File folder = new File("C:\\Users\\itsix\\Desktop\\youtube_downloads");
		//String destination = "C:\\Users\\itsix\\Desktop\\test";
		
		for (File fileEntry : folder.listFiles()) {
			System.out.println(fileEntry.getName());
			list.add(fileEntry);
	    }

		ControllerThreads cT = new ControllerThreads(list, destination);
		
	}
	
}
