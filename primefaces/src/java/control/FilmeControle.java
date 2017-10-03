/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Filme;
import org.primefaces.model.DualListModel;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author Ton
 */
@ManagedBean
@ViewScoped
public class FilmeControle implements Serializable {

    private List<Filme> lista;
    private List<Filme> assistidos;
    private DualListModel<Filme> listaoDl;

    @PostConstruct
    public void init() {
        lista = new ArrayList();
        assistidos = new ArrayList();
        addLista(1960, "Psicose", "A obra-prima de Alfred Hitchcock trata a psicose com primor em cenas que brincam e instigam o raciocínio investigativo do espectador. Enquanto a cenografia e a sonoplastia contribuem para o clima de terror, o resto trabalha no suspense que prendem até o fim do filme.");
        addLista(1973, "O Exorcista", "Lançado em 1973, O Exorcista chocou plateias do mundo todo pela subversão dos dogmas da igreja católica ao longo de pouco mais de duas horas – tudo a partir da história de uma possessão infantil. Mas os elementos que contribuem para esse ser um dos grandes filmes de terror não se limitam às cenas provocativas: o longa também é cercado de lendas, incluindo morte de atores e lesões reais no set de filmagem.");
        addLista(1974, "O Massacre da Serra Elétrica", "É de se imaginar que pessoas que tiveram a oportunidade de assistir aO Massacre da Serra Elétrica em sua estreia, em 1974, geraram fortunas para psicólogos e analistas, como forma de se recuperarem do impacto causado por Leatherface e a família mais desajustada do Texas. Mas fuja do remake, de 2003, como se fosse um hippie fugindo de um gancho de açougueiro.");
        addLista(1976, "A Profecia", "Quando o remake de A Profecia foi lançado, a pré-estreia mundial aconteceu em seis de junho de 2006 – 6/6/6. Nada mais adequado. A versão mais recente, contudo, não consegue replicar o clima soturno provocado em 1976 por Damien, o herdeiro do demônio que provavelmente fez muitos pais à época repensarem a ideia de terem filhos. Assustador até os dias de hoje.");
        addLista(1979, "Alien: O Oitavo Passageiro", "Outro clássico que realçou uma criatura e seu criador, H.R Giger, ao estrelato. Se a ideia de um ser desenvolvido e perigoso habitando o espaço já não é assustador, imagine um que tem uma boca dentro da boca? Difícil pensar em algo mais ameaçador.");
        addLista(1980, "Holocausto Canibal", "O fato de Eli Roth dar uma repaginada a Holocausto Canibal com seu – ainda inédito – Green Inferno sugere o tipo de influência provocada pela produção italiana. A controvérsia com o uso de animais e das cenas de violência explícita – tiros e facadas tornaram-se infantis se comparadas ao empalamento de documentaristas exibido no filme – levaram a imprensa da época a questionar se de fato aquilo era apenas ficção.");
        addLista(1980, "O Iluminado", "O clássico de Stanley Kubrick causa medo em muita gente pela temática espiritual e psicológica com direito a aparições assustadoras, clima sombrio e uma atuação arrepiantemente impressionante de Jack Nicholson no papel de um escritor alcoólatra em recuperação. Para completar, o longa é baseado na obra homônima escrita pelo mestre do terror, Stephen King.");
        addLista(1981, "Evil Dead: A Morte do Demônio - ou Uma Noite Alucinante", "Os críticos podem torcer o nariz, mas o remake do clássico do terror de 1981 lançado em 2013 também merece aplausos. Enquanto as cenas do original caíram na categoria gore que beira o trash, as sequências da nova versão exigem estômago. O enredo segue o primeiro roteiro, temperado com boas cenas cheias de sangue e automutilação. Um filme que impressiona.");
        addLista(1982, "Poltergeist", "Um verdadeiro clássico que recentemente ganhou um remake. Ao envolver fenômenos elétricos e eletrônicos com fantasmas e demônios, deixou uma geração inteira tremendo com o menor barulho da estática das TVs.");
        addLista(1984, "A Hora do Pesadelo", "Além de criar um dos personagens mais marcantes da cultura pop, Freddy Krueger, trouxe um conceito diferente: nem nos sonhos você está a salvo. A ironia do antagonista, além das mortes grotescas, coroam o clássico. Uma obra-prima do mestre Wes Kraven, que nos deixou em 2015.");
        addLista(1985, "A Volta dos Mortos-Vivos", "Trocadilhos à parte, zumbis ganharam vida mais uma vez em tempos recentes – de The Walking Dead a Guerra Mundial Z, os mortos-vivos se tornaram estrelas das telas. Mas o charme de A Volta dos Mortos Vivos ainda segue imbatível. Cérebros!");
        addLista(1988, "Brinquedo Assassino", "Bonecos, coisa de criança? Chucky é a encarnação do mal na pele – ou no plástico – do brinquedo que assassina das maneiras mais criativas as pessoas ao redor. A franquia deu origem a 6 títulos de qualidade questionável – entre os quais as quase-comédias A Noiva de Chucky e O Filho de Chucky – mas o primeiro Boneco Assassino, é um clássico absoluto.");
        addLista(1997, "Violência Gratuita", "Que lugar é mais seguro que sua própria casa? E se dois sádicos a invadissem e começassem a torturá-lo  das piores formas possíveis, o que você toparia fazer para sobreviver? Tem um leve toque de Laranja Mecânica, mas constrói a tensão de uma maneira natural - o que é um pouco estranho.");
        addLista(1998, "Ringu - O Chamado", "Com menos efeitos especiais que o remake americano, a versão original japonesa de O Chamado preza pelo medo realista. O filho da personagem principal, por exemplo, deixa o dom da clarividência evidente ao conversar com os mortos, enquanto o enredo caracteriza o espírito de Sadako como uma entidade maligna e não uma alma penalizada, como a de Samara no filme dos EUA. Já dá para imaginar o resultado...");
        addLista(1999, "A Bruxa de Blair", "Muitos consideram um filme ruim, mas vale lembrar que é um dos primeiros sucessos de found footage - quando a câmera dita a perspectiva do protagonista. O marketing, no início da popularização da internet, também foi genial: além de espalhar o boato que as imagens eram reais, os produtores conseguiram levantar a dúvida que persiste até hoje: afinal, a bruxa de Blair é real?");
        addLista(2001, "Ichi - O Assassino", "Não espere envolvimento dos personagens nesse longa: a proposta é dar destaque para cenas de violência extrema, com direito a estupro, tortura e assassinatos das formas mais brutais que a mente humana pode imaginar. O longa conta a história da perseguição de um chefe Yakuza por um assassino psicopata contratado por um sadomasoquista de uma gangue japonesa.");
        addLista(2002, "Ju-On - O Grito", "Se a versão ocidental já o assustou, não assista a japonesa. A temática é a mesma: uma maldição, vinda de uma morte cheia de ódio. E onde os orientais ganham? Nas cenas assustadoras, aquelas que você não consegue entender como alguém pensou naquilo. Um bom exemplo disso é o momento de um parto. Guarde isso e, depois de ver o longa, entenderá do que estamos falando.");
        addLista(2002, "Sinais", "Os ETs só aparecem no final, mas a atmosfera de ser vigiado por seres de outro planeta gera uma tensão digna de gritar 'Mel Gibson, faça o que quiser, mas não entre nesse milharal no meio da noite'. O título do filme também faz referências a como o destino age de uma forma orquestrada - quer você acredite ou não.");
        addLista(2004, "O Ajudante de Satã", "Em O Ajudante de Satã, um garoto se depara com um serial killer vestido como o personagem de seu jogo favorito de videogame. Ele assume, então, o posto de ajudante do criminoso no Halloween sem perceber a consequência dos seus atos, que incluem atropelamento de grávidas e carrinhos de bebê. A brutalidade está no tratamento que o roteiro dá à situação: para o menino, todas as atitudes equivalem a pontos no “game”.");
        addLista(2004, "Jogos Mortais", "Uma das franquias de terror de maior sucesso dos últimos anos, Jogos Mortais ganhou mais seis filmes sobre a história de um serial killer que nada mais quer do que corrigir a índole das pessoas. No primeiro longa, a história se passa em um banheiro no qual dois homens se submetem a sequências de automutilação que combinam boas cenas de violência e terror psicológico. Prepare-se para ouvir muitos gritos de dor e desespero.");
        addLista(2005, "O Albergue", "Eli Roth, caso não tivesse uma carreira estabelecida em Hollywood, provavelmente seria um serial killer. A mente doentia do diretor encontra vazão criativa em O Albergue, que deu um glamour pop ao gore. Entre muitas, uma cena que envolve olhos e maçarico está entre os momentos mais aterradores do cinema de horror.");
        addLista(2005, "O  Exorcismo de Emily Rose", "Inspirado no caso verídico da jovem alemã Anneliese Michel, traz sessões de exorcismo bem explicitas e impactantes. Como a narrativa é ditada de acordo com o julgamento do Estado contra o padre, há uma dualidade entre realidade e imaginação, deixando o espectador julgar se o Coisa-Ruim invadiu ou não o corpo de Emily.");
        addLista(2005, "Rejeitados pelo Diabo", "Não bastasse o sucesso nos palcos com o antigo White Zombie e com sua banda solo, Rob Zombie também é um diretor de mão cheia. Rejeitados Pelo Diabo dá a pista, a partir de seu título, dos personagens explorados na película. Além do roteiro bem amarrado, o filme conta com o melhor uso da história de uma canção – Free Bird, do Lynyrd Skynyrd – em uma cena.");
        addLista(2007, "A Fronteira", "Apesar da temática apelativa, A Fronteira garante momentos de violência não só física, mas psicológica. A explicação: o filme conta a história de um grupo de amigos que vai parar em um albergue administrado por uma família de neonazistas canibais, onde uma garota grávida e seus amigos devem lutar pela sobrevivência. As boas atuações contribuem para momentos de angústia, desconforto e muito sangue.");
        addLista(2008, "Deixe Ela Entrar", "O amor e a infância podem ser tão belos quanto assustadores – especialmente quando há vampiros envolvidos. Nada no terror sueco Deixe Ela Entrar é gratuito. Encontrar significado na violência da produção é um exercício compensador – sutileza que fica marginalizada na versão americana do filme, lançada em 2010 e mais palatável para grandes audiências.");
        addLista(2010, "A Serbian Film - Terror Sem Limites", "Pornografia, necrofilia, sugestão de pedofilia. Não por acaso – e isso sem contar com a violência explícita –, A Serbian Film teve sua exibição banida em diversos países. Dar contornos artísticos a temas que são tabus sem abrir concessões foi um dos grandes algozes da produção sérvia, na mesma proporção que tais percalços alçaram o filme de 2010 ao status de cult.");
        addLista(2011, "O Segredo da Cabana", "Lembra dos best-sellers literários A Cabana e O Segredo? O Segredo da Cabana é o oposto dos livros de autoajuda: humor negro, sangue, mortes espetaculares e um roteiro que segue rumos tão surreais que impressionam o próprio diabo na fusão entre o tosco e o sublime.");
        addLista(2012, "V/H/S", "O terror de 2012 reúne uma série de curtas de diferentes diretores ligados por um fato em comum: todos estão gravados em VHS, cujas cenas mostram passagens assustadoras em diferentes circunstâncias e graus de violência. Espere ver assassinatos brutais e deformações bizarras para todos os gostos.");
        addLista(2013, "Invocação do Mal", "Acompanha o primeiro grande caso do casal Warren - dois famosos caçadores paranormais norte-americanos. O título recuperou o antigo gênero de casa mal-assombrada, com um ritmo de filme que deixa o espectador grudado no sofá para, em seguida, tomar um susto digno de jogar a pipoca longe.");
        addLista(2014, "Babadook", "Pode soar como uma nova história do Bicho-Papão, mas é um filme que fala do medo de ficar sozinho e que, em todo momento, coloca a sanidade da protagonista (e o entendimento de quem está assistindo) em cheque.");
        addLista(2015, "Corrente do Mal", "Um dos mais recentes da seleção, ele traz de volta o terror  psicológico em alta: o cenário, a ideia de ser perseguido por uma entidade que muda de forma, é muito mais assustador que um fantasma ou um morto-vivo. Ainda tem uma inteligente metáfora sobre DSTs.");

        listaoDl = new DualListModel<>(lista, assistidos);

    }

    public List<Filme> getLista() {
        return lista;
    }

    public void addLista(int ano, String nome, String descricao) {
        Filme filme = new Filme();
        filme.setAno(ano);
        filme.setNome(nome);
        filme.setDescricao(descricao);
        this.lista.add(filme);
    }

    public List<Filme> getAssistidos() {
        return assistidos;
    }

    public void setAssistidos(List<Filme> assistidos) {
        this.assistidos = assistidos;
    }

    public DualListModel<Filme> getListaoDl() {
        return listaoDl;
    }

    public void setListaoDl(DualListModel<Filme> listaoDl) {
        this.listaoDl = listaoDl;
    }

    public void onTransfer(TransferEvent event) {
        StringBuilder builder = new StringBuilder();
        for (Object item : event.getItems()) {
            // Fazer algo com o item (geralmente utilizado diretamente em persistencia
        }

        FacesMessage msg = new FacesMessage();
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        msg.setSummary("Itens transferidos");
        msg.setDetail(builder.toString());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onSelect(SelectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selecionado", event.getObject().toString()));
    }

    public void onUnselect(UnselectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item desmarcado", event.getObject().toString()));
    }

    public void onReorder() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Lista reorganizada", null));
    }

//    Mensagem de alerta para o carrossel
    public void feedBack() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Obrigado pela avaliação.",
                "Uma boa sessão de filme.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

//    Disposição do método para atender evento Edição na Linha
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Filme editado", ((Filme) event.getObject()).getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

//    Disposição do método para atender evento cancelamento da Edição na Linha    
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição Cancelada", ((Filme) event.getObject()).getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

//    Disposição do método para atender evento de edição da célula
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();

        if (newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Campo editado", "Antes: " + oldValue + ", Agora:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

}
