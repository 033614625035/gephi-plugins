
import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsBuilder;
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
@ServiceProvider(service = StatisticsBuilder.class)
public class MultilayerClosenessBuilder implements StatisticsBuilder {

    public String getName() {
        return "Multilayer Closeness";
    }

    public Statistics getStatistics() {
        return new MultilayerCloseness();
    }

    public Class<? extends Statistics> getStatisticsClass() {
        return MultilayerCloseness.class;
    }
    
}