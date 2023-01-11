import { HttpClient } from '@angular/common/http';
import { Injectable, OnInit } from '@angular/core';
import { map, Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { JavaAiResponse } from '../common/java-ai-response';

@Injectable({
  providedIn: 'root'
})
export class JavaAiService implements OnInit {
  baseUrl: string = environment.baseUrl;
  apiResponseImageOrText: JavaAiResponse | any = {}

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.requestDataFromAi();
  }

  requestDataFromAi(){
    return this.http.get<JavaAiResponse>(environment.baseUrl).pipe(
      map(data => {
        return this.apiResponseImageOrText=data;
      })
    );
  }

}
