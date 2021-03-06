package models;
/**
 * GLDA: A Java code for the Guided-LDA topic model
 * 
 * like in LDA, each document is assumed to be a mixture over topics
 * but each topic is a convex combination of a seed topic and a traditional
 * LDA style topic. GLDA guide the model to learn a desired topic by providing
 * seed words in each topic, as described in:
 * 
 * Jagarlamudi, Jagadeesh, Raghavendra Udupa, and Hal Daum� III. 
 * "Incorporating Prior Lexical Information in Topic Models.".
 * 
 * @author Sultan Alqahtani
 */
public class GibbsSamplingGLDA {

	/**
	 * Gipps sampling equations, given by the model's author
	 * For i^th token: p(z_i = j, x_i|...) \propto p(w_i|z_i=j,x_i) * p(x_i | z_i=j) * p(z_i =j | d). 
	 * The equations for this model are quite similar to that of LDA, except we have the binary x_i variable.
	 * p(z_i = j | d) = (Number of tokens with topic j in doc d + dAlpha) / (Number of tokens in doc d + dAlpha*K)
	 * p(x_i = 1| z) = tau and p(x_i=0|z) = 1- tau  (I tried to learn these values but, if I remember correctly, that didn't help)
	 * p(w_i | z_i=j, x_i=1) = (Number of word tokens of word wi with seed topic j + dMu) / (Number of seed tokens in topic j + dMu*W) 
	 * p(w_i | z_i=j, x_i=0) = (Number of word tokens of word wi with topic j + dBeta) / (Number of tokens in topic j + dBeta * W)
	 */
}
