import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-ai-status-image',
  templateUrl: './ai-status-image.component.html',
  styleUrls: ['./ai-status-image.component.scss']
})
export class AiStatusImageComponent {
  @Input() nature: string | undefined;
  @Input() typeOf: string | undefined;


  changeAiImage(): string {
    if (this.nature == 'duckImage') {
      return 'assets/images/java-uninpressed.png';
    }
    if (this.nature == 'danceImage') {
      return 'assets/images/java-uninpressed.png';
    }
    if (this.nature == 'coffeeImage') {
      return 'assets/images/java-uninpressed.png';
    }
    if(this.nature=='dadJokes'){
      return 'assets/images/java-facepalm.png';
    }
    if(this.nature=='dadJokes'){
      return 'assets/images/java-facepalm.png';
    }
    if (this.nature == 'bonkImage') {
      return 'assets/images/java-thumbs.png';
    }else{
      return 'assets/images/java-thumbs.png';
    }
  }

}
