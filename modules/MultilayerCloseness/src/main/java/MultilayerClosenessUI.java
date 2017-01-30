
import javax.swing.JPanel;
import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsUI;
import org.openide.util.lookup.ServiceProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rémi
 */
@ServiceProvider(service = StatisticsUI.class)
public class MultilayerClosenessUI implements StatisticsUI{
    private MultilayerClosenessPanel panel;
    private MultilayerCloseness multilayerCloseness;

    public JPanel getSettingsPanel() {
        panel = new MultilayerClosenessPanel();
        return panel;
    }

    public void setup(Statistics ststcs) {
        this.multilayerCloseness = (MultilayerCloseness) ststcs;
        if(panel!=null) {
            panel.setDirected(multilayerCloseness.isDirected());
        }
    }

    public void unsetup() {
        if(panel!=null) {
            multilayerCloseness.setDirected(panel.isDirected());
        }
        panel = null;
    }

    public Class<? extends Statistics> getStatisticsClass() {
        return MultilayerCloseness.class;
    }

    public String getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDisplayName() {
        return "Multilayer Closeness";
    }

    public String getShortDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCategory() {
        return StatisticsUI.CATEGORY_NETWORK_OVERVIEW;
    }

    public int getPosition() {
        return 800;
    }
    
}
